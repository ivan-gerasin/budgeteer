package dev.gerasin;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;

public class Operation implements IOperation {
    final private IOperationCategory realCategory;
    final private IOperationCategory causeCategory;
    final private BigDecimal sum;
    final private Calendar datetime;
    final private String comment;

    Operation(@NotNull BigDecimal aSum, IOperationCategory realCat, IOperationCategory causeCat, String aComment) throws ZeroSumOperationException{
        if (aSum.compareTo(BigDecimal.ZERO) == 0) {
            throw new ZeroSumOperationException();
        }
        sum = aSum;
        realCategory = realCat;
        causeCategory = causeCat;
        datetime = Calendar.getInstance();
        comment = aComment;
    }

    @Override
    public String getComment() {
        return comment;
    }

    @Override
    public OperationType getType() {
        if (sum.compareTo(BigDecimal.ZERO) > 0) {
            return OperationType.INCOME;
        }
        return OperationType.OUTCOME;
    }

    @Override
    public IOperationCategory getRealCategory() {
        return realCategory;
    }

    @Override
    public IOperationCategory getCauseCategory() {
        return causeCategory;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.ofInstant(datetime.toInstant(), ZoneId.systemDefault());
    }
}

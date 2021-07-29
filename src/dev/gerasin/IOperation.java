package dev.gerasin;

import dev.gerasin.interfaces.basic.IWithComment;
import dev.gerasin.interfaces.basic.IWithDateTime;

public interface IOperation extends IWithComment, IWithDateTime {
    OperationType getType();
    IOperationCategory getRealCategory();
    IOperationCategory getCauseCategory();
}

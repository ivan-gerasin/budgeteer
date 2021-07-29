package dev.gerasin;

public class OperationCategory implements IOperationCategory {
    final private String name;
    final private String comment;

    OperationCategory(String aName, String aComment) {
        name = aName;
        comment = aComment;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getComment() {
        return comment;
    }
}

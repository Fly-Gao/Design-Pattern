package chanOfResp;

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;//责任链上的后继对象

    public Leader(String name) {
        this.name = name;
    }

    //设置责任链的下级对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LeaveRequest request);
}

package chanOfResp;

public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张主任");
        Leader b = new Manager("李经理");

        //设置责任链的关系
        a.setNextLeader(b);
        LeaveRequest request = new LeaveRequest("Tom", 10, "回家相亲！");
        a.handleRequest(request);
    }
}

package ca.ulaval.glo4002.solid_isp;

public interface Payable {
    int calculateSalary(int hours);
    void sendCheck(int amount);
}

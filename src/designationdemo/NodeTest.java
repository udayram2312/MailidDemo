package designationdemo;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {

    public static void main(String[] args) {

       Node divisionFinance = new Node();
       divisionFinance.key = "Division";
       divisionFinance.label = new String("Finance");

       List<Node> childOfDivisionFinance = new ArrayList<>();
       Node payroll = new Node();
       payroll.key = "Department";
       payroll.label = "payroll";

       Node generalFinance = new Node();
       Node procurement = new Node();

        childOfDivisionFinance.add(payroll);
        childOfDivisionFinance.add(generalFinance);
        childOfDivisionFinance.add(procurement);
        divisionFinance.child=childOfDivisionFinance;

        List<Node> childOfProcurement = new ArrayList<>();
        Node procurementManager = new Node();
        Node assistantProcurementManager = new Node();
        Node procurementExceutive = new Node();
        childOfProcurement.add(procurementManager);
        childOfProcurement.add(assistantProcurementManager);
        childOfProcurement.add(procurementExceutive);
        System.out.println(divisionFinance.child);




    }
}

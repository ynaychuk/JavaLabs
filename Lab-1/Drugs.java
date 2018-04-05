package ua.lviv.iot;

import java.util.Date;

public class Drugs {

    private String name;
    private String forWhat;
    private String maker;
    private Date expirationDate;
    private int cost;
    private static long summaryCost = 0;

    public Drugs(){
    }

    public Drugs(String name, String forWhat, String maker, Date expirationDate){
        this.name = name;
        this.forWhat = forWhat;
        this.maker = maker;
        this.expirationDate = expirationDate;
    }

    public Drugs(String name, String forWhat, String maker, Date expirationDate , int cost){
        setName(name);
        setForWhat(forWhat);
        setMaker(maker);
        setExpirationDate(expirationDate);
        setCost(cost);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setForWhat(String forWhat){
        this.forWhat = forWhat;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setExpirationDate(Date expirationDate){
        this.expirationDate = expirationDate;
    }

    public void setCost(int cost){
        summaryCost += cost;
        this.cost = cost;
    }

    public void resetValues(String name, String forWhat, String maker, Date expirationDate , int cost){
        setName(name);
        setForWhat(forWhat);
        setMaker(maker);
        setExpirationDate(expirationDate);
        setCost(cost);
    }

    @Override
    public String toString(){
        return "Drugs{" +
                "name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", forWhat='" + forWhat + '\'' +
                ", expirationDate'" + expirationDate + '\'' +
                ", cost'" + cost + '\'' +
                '}';
    }

    public void printSum(){
        System.out.println("Summary cost of all drugs = " + summaryCost);
    }

    public static void printStaticSum(){
        System.out.println("Summary cost of all drugs = " + summaryCost);
    }

}
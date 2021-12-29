package temp;

public class Player {
    public int id;
    public String name;
    public double average;
    public int rank;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public int getRank() {
        return rank;
    }


    public Player(int id,String name,double average,int rank){
        this.id=id;
        this.name=name;
        this.average=average;
        this.rank=rank;
    }
}

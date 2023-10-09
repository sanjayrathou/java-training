package GtterSetter;

public class Student {
    public String name;
    private int rno;
    double percent;

    final String schoolName = "dps";             //  final KEYWORD ITS VALUE NEVER CHANGES.

    public int getRno(){                // getter
        return rno;
    }

    public void setRno(int rno){       // setter
        this.rno = rno;
    }

}


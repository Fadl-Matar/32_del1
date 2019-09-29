package Spil;

public class spil {
    private final int Max = 6;
    private int faceValue;

    //konstruktør
    public spil(int value)
    {
        faceValue = value;
    }

    public int roll()
    {
        faceValue = (int)(Math.random()*Max+1);

        return faceValue;
    }

    public void setFaceValue (int value)
    {
        faceValue = value;
    }

    public int getFaceValue()
    {
        return faceValue;
    }

    public toString()
    {
        String result = "øjne: " + faceValue;
        return result;
    }
}
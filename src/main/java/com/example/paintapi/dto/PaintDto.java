package com.example.paintapi.dto;

public class PaintDto{
    private String Name;
    private String Type;
    private String Catefory;
    private int Red;
    private int Green;
    private int Blue;
    private int Amoount;
   
    
    public  void SetName(String name)
    {
        Name =name;
    }
    public void SetType(String type)
    {
        Type =type;
    }
    public  void SetCatefory(String category)
    {
        Catefory =category;
    }
    public  void SetRed(int red)
    {
        Red =red;
    }
    public void SetGreen(int green)
    {
        Green =green;
    }
    public void SetBlue(int blue)
    {
        Blue =blue;
    }
    public void SetAmoount(int amoount)
    {
        Amoount =amoount;
    }


    public  String GetName()
    {
        return Name;
    }
    public String GetType()
    {
        return Type;
    }
    public  String GetCatefory()
    {
        return Catefory ;
    }
    public  int GetRed()
    {
        return Red;
    }
    public int GetGreen()
    {
        return Green;
    }
    public int GetBlue()
    {
        return Blue;
    }
    public int GetAmoount()
    {
        return Amoount;
    }
}
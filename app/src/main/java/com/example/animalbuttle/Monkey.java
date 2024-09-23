package com.example.animalbuttle;

public class Monkey extends Animal
{
    public Monkey()
    {
        super(7);
    }
    public String Battle(Animal other)
    {
        if(this.strangth = other.strangth)
        {
            return "it is a tie.";
        }
        else if(this.strangth > other.strangth)
        {
            return "monkey wins";
        }
        else
        {
            return "monkey loses";
        }
    }
}

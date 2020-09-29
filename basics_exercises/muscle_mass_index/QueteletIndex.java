public class QueteletIndex
{
    private double weight;
    private double height;

    public QueteletIndex( double weight, double height )
    {
        this.weight = weight;
        this.height = height;
    }

    public double mmi()
    {
        return weight / Math.pow( height, 2 );
    }

    public String result()
    {
        final double mmi = mmi();
        if( mmi < 18.5 )
            return "Less than normal weight";    
        if( ( mmi >= 18.5 ) && ( mmi <= 24.9) )
            return "Normal";
        if( ( mmi >= 25.0 ) && ( mmi <= 29.9) )
            return "Above normal weight";
        return "Obesity";
    }    
    
}

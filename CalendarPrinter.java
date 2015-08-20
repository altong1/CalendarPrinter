public class CalendarPrinter
{
    public static void main (String[] args)
    {
        int d = 1;
        String x = "";
        while (d < 31)
        {
            if (d == 5 || d == 6 || d == 12 || d == 13 || d == 19 || d == 20 || d == 26 || d == 27)
                x = " - WEEKEND";
            else if (d == 7)
                x = " - NO SCHOOL (LABOR DAY)";
            else if (d == 25)
                x = " - END OF MARKING PERIOD";
            else
                x = "";
            System.out.println("September " + d + x);
            d++;
        }
    }
}
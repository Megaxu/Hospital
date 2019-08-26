import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        double[] patients = new double[30];
        double totalTemperature = 0;
        int healthyPatient = 0;

        for(int i = 0; i < patients.length; i++)
        {
            double temperature = 32 + (Math.random() * 10);
            patients[i] = temperature;
            totalTemperature += temperature;

            if(temperature >= 36.2 && temperature <= 36.9)
            {
                healthyPatient++;
            }

            System.out.printf("%.1f", patients[i]);
        }

        String midTemperature = new DecimalFormat("#0.0").format(totalTemperature / patients.length);
        System.out.println("\nСредняя температура по больнице " + midTemperature + " градусов.");
        System.out.println("Здоровых пациентов: " + healthyPatient + " человек.");
    }
}

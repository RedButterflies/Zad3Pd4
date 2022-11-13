public class Zad3PD4 {
    static void UmieszczanieWMacierzy()
    {
        int [][] macierz = new int [10][10];
        int suma=0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(i!=j) {
                    macierz[i][j] = 0;
                }
                else {
                    macierz[i][j] = 1;
                    suma+=macierz[i][j];
                }
            }
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print(macierz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Suma elementow wyroznionych wynosi: "+suma);

    }

}

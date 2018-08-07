import java.util.Objects;

public class Sil {

    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDiscription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if(country.equals(Country.RUSSIA)){
                hen = new Hen.RussianHen();
            } else if (country.equals(Country.BELARUS)){
                hen = new BelarusianHen();
            }else if(country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();
            } else if (country.equals(Country.UKRAINE)){
                hen = new UkrainianHen();
            }

            return hen;
        }
    }

    public abstract static class Hen
    {
        abstract int getCountOfEggsPerMonth();


    public String getDiscription()
    {
        return "Я - курица";
    }

    public static class RussianHen extends Hen {

        @Override
        int getCountOfEggsPerMonth() {
            return 70;
        }

        public String getDiscription() {
            return super.getDiscription() + "Моя страна" + Country.RUSSIA + "." + " Я несу " + getCountOfEggsPerMonth() + "яиц в месяц";
        }
    }
    }

    public static class UkrainianHen extends Hen{

        @Override
        int getCountOfEggsPerMonth() {
            return 80;
        }
        public String getDiscription() {
            return super.getDiscription() + "Моя страна" + Country.UKRAINE + "." + " Я несу " + getCountOfEggsPerMonth() + "яиц в месяц";
        }
    }

    public static class MoldovanHen extends Hen{

        @Override
        int getCountOfEggsPerMonth() {
            return 90;
        }
        public String getDiscription() {
            return super.getDiscription() + "Моя страна" + Country.MOLDOVA + "." + " Я несу " + getCountOfEggsPerMonth() + "яиц в месяц";
        }
    }

    public static class BelarusianHen extends Hen{

        @Override
        int getCountOfEggsPerMonth() {
            return 106;
        }
        public String getDiscription() {
            return super.getDiscription() + " Моя страна" + Country.BELARUS + "." + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
        }
    }

    interface Country{
        String RUSSIA = " Россия";
        String BELARUS = " Беларусь";
        String MOLDOVA = " Молдова";
        String UKRAINE = " Украина";
    }

}

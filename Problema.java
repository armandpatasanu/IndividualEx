class Main
{
    public static void main (String[] args)
    {
        CabinetAvocatura c1= new CabinetAvocatura("Armand");
        CabinetAvocatura c2= new CabinetAvocatura("Mariusel");
        c1.AdaugaCaz("Andrei","Robert");
        c1.AdaugaCaz("Andrei","Mircea");
        c2.AdaugaCaz("Laur","Iovan");
        c2.AdaugaCaz("Laura","Mircea");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.formeazaAlianta(c2).toString());

    }
}
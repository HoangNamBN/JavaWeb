package CauHoiPhongVan.OverrideMethods;

public class CParrot extends CBird {
    @Override
    public void getInfo() {
        System.out.println("Parrot");
        super.getInfo();
    }
}

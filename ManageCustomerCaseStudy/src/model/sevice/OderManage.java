package model.sevice;

import data.readWriteFile.RAWOder;
import model.entity.Oder;
import java.util.List;

public class OderManage {
    private RAWOder rawOder = new RAWOder();
    private List<Oder> oders = rawOder.readFileOder();

    public void oderBill(Oder oder){
        this.oders = rawOder.readFileOder();
        oders.add(oder);
        rawOder.writeFileOder(oders);
    }
    public List<Oder> showBill(){
        return rawOder.readFileOder();
    }
}

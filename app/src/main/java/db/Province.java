package db;

import org.litepal.crud.DataSupport;

/**
 * Created by xian on 2017/9/13.
 */

public class Province extends DataSupport {
    //省份ID
    private int id;
    //省份名称
    private String provinceName;
    //省份代号
    private int provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

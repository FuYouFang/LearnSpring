package com.fuyoufang.editor6_2_3;

import java.beans.PropertyEditorSupport;

public class HouseEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text == null || text.indexOf(",") == -1) {
            throw new IllegalArgumentException("格式错误");
        }

        String[] infos = text.split(",");
        House house = new House();
        house.setCity(infos[0]);
        house.setAddress(infos[1]);
        setValue(house);
    }

    @Override
    public String getAsText() {
        Object object = getValue();
        if (object == null) {
          return "";
        }
        House house = (House)object;
        return house.getCity() + "," + house.getAddress();
    }
}

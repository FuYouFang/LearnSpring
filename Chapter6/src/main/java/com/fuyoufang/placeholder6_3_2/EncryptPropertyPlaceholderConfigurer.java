package com.fuyoufang.placeholder6_3_2;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
//        private String[] encryptPropNames ={"userName","password"};
    private String[] encryptPropNames = {};

    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
//        System.out.println("name:" + propertyName + "  value:" + propertyValue);
        if (isEncryptProp(propertyName)) {
            System.out.println(propertyValue);
            String decryptValue = DESUtils.getDecryptString(propertyValue);

            return decryptValue;
        } else {
            return propertyValue;
        }
    }

    private boolean isEncryptProp(String propertyName) {
        for (String encryptPropName : encryptPropNames) {
            if (encryptPropName.equals(propertyName)) {
                return true;
            }
        }
        return false;
    }
}

package com.fuyoufang.anno5_10;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class TwoPlugin implements Plugin {
}

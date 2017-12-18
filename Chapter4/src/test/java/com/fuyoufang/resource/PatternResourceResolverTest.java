package com.fuyoufang.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.testng.annotations.Test;

public class PatternResourceResolverTest {
    @Test
    public void testGetResources() throws Exception {
        ResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();

//        Resource[] resources = patternResolver.getResources("classpath*:com/**/*.txt");
        Resource[] resources = patternResolver.getResources("classpath*:**/*.txt");
        for (Resource resource : resources) {

            System.out.println("a" + resource.getDescription());
        }
    }
}

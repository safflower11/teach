package com.lut.teach.service;

import com.lut.teach.bean.Region;

import java.util.List;

public interface IRegionService {
    List<Region> findAll()throws RuntimeException;
}


package com.lut.teach.service.impl;



import com.lut.teach.bean.Region;
import com.lut.teach.bean.RegionExample;
import com.lut.teach.mapper.RegionMapper;
import com.lut.teach.service.IRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegionServiceImpl implements IRegionService {
    @Autowired
    private RegionMapper regionMapper;
    @Override
    public List<Region> findAll() throws RuntimeException {
        return regionMapper.selectByExample(new RegionExample());

    }
}

package com.lut.teach.service;

import com.lut.teach.bean.ex.ResultEx;

import java.util.List;

public interface IResultService {
    List<ResultEx> findBy(String word) throws RuntimeException;
}

package com.kgc.service;

import com.kgc.pojo.Assets;

import java.util.List;

public interface AssetsService {
    List<Assets> selectAll(String assetid,String assettype);
    void insert(Assets assets);
}

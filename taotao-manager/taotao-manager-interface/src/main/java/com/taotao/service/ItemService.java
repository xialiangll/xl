package com.taotao.service;

import com.taotao.common.pojo.EasyUiDateGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
  
	TbItem getItemById(Long itemId);
	EasyUiDateGridResult getItemList(int page, int rows);
	TaotaoResult addItem(TbItem item, String desc);
}

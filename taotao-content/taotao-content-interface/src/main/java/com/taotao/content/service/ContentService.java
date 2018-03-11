package com.taotao.content.service;

import java.util.List;

import com.taotao.common.pojo.EasyUiDateGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbContent;

public interface ContentService {

	TaotaoResult addContent(TbContent content);
	EasyUiDateGridResult getItemList(Long categoryId, int page, int rows);
	List<TbContent> getContentByCid(long cid);
}

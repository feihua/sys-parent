package com.liufeihua.sys.common.response;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ElementTreeVo implements Serializable {

	private int id;
	private String label;

	private List<ElementTreeVo> children;
}

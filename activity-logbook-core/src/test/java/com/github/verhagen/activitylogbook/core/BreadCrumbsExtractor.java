package com.github.verhagen.activitylogbook.core;

import java.util.ArrayList;
import java.util.List;

import com.github.verhagen.activitylogbook.domain.Visitor;

class BreadCrumbsExtractor implements Visitor<Node<String, String>> {
	private List<String> breadCrumbs = new ArrayList<>();

	@Override
	public void visit(Node<String, String> node) {
		if (node.getBreadCrumbs().size() > 0) {
			breadCrumbs.add(node.getBreadCrumbs().toString());
		}
	}

	public List<String> getBreadCrumbs() {
		return breadCrumbs;
	}

}
package manvelyan.david403.graphs;

import java.util.List;

import manvelyan.david403.graphs.model.LinkItem;
import manvelyan.david403.graphs.model.NodeItem;

public interface OnPointXYChangedListener {

    void onXYChanged(NodeItem newNode, List<LinkItem> newLinks);
}
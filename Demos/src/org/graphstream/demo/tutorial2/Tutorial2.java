package org.graphstream.demo.tutorial2;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.stream.file.*;

import java.io.IOException;

public class Tutorial2 {
	public static void main(String args[]) throws IOException, InterruptedException {
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		Graph graph = new SingleGraph("Tutorial2");
		graph.addAttribute("ui.antialias");
		graph.addAttribute("ui.quality");
		graph.setAttribute("ui.stylesheet", "url(data/style.css);");

		graph.display();
		FileSource source = new FileSourceDGS();
		source.addSink( graph );
		source.begin("data/tutorial2.dgs");
		while(source.nextEvents());
		source.end();
	}
}
package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.member.lib.common.Connector;

class P{
	int point;
	int grade;
	int age;
	P(int point){
		this.point = point;
	}
}
public class FlowController {
	public static void main(String[] args) {
		List<P> strList = new ArrayList<>();
		strList.add(new P(14));
		strList.add(new P(12));
		strList.add(new P(13));
	}
}







package com.mindtree.O2Store_Project.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.O2Store_Project.core.bean.Plant;

public class PlantDao {
	public static void main(String[] args) {
		PlantDao dao=new PlantDao();
		List<Plant> list=dao.fetchData("Herb");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	public List<Plant> fetchData(String type){
		List<Plant> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/project";
		String username="root";
		String password="root";
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			PreparedStatement statement = connection.prepareStatement("select plants.plantname,plants.price from plants\r\n" + 
					"inner join plantcategories on plants.id=plantcategories.plant_id\r\n" + 
					"inner join categories on plantcategories.cat_id=categories.catid\r\n" + 
					"where categories.category=?");
			statement.setString(1, type);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				Plant p=new Plant();
				p.setName(rs.getString(1));
				p.setPrice(rs.getInt(2));
				list.add(p);
				//list.add(rs.getString(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}


}

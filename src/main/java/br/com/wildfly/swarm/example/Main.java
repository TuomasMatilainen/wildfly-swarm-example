package br.com.wildfly.swarm.example;

import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.datasources.DatasourcesFraction;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Swarm container = new Swarm();
		container.fraction(datasourceWithSQLServer());
		
		container.start().deploy();

	}

	private static DatasourcesFraction datasourceWithSQLServer() {
		return new DatasourcesFraction()
				.jdbcDriver("sqljdbc4", (d) -> {
							d.driverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
							d.xaDatasourceClass("com.microsoft.sqlserver.jdbc.SQLServerXADataSource");
							d.driverModuleName("com.microsoft.sqlserver.jdbc");
						})
					.dataSource("myDb", (ds) -> {
						ds.driverName("sqljdbc4");
						ds.connectionUrl("<connectionURL>");
						ds.userName("<userName>");
						ds.password("<password>");
					}
				);
	}

}

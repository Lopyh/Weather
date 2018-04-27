package weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Query;


public class MyPojo {
    private QueryMy query;
    public QueryMy getQuery ()
    {
        return query;
    }

    public void setQuery(QueryMy query) {
        this.query = query;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [query = "+query+"]";
    }
}

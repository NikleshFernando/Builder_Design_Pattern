public class Query {
    String select;
    String from;
    private String where;
    private String orderBy;

    public void setSelect(String select) {
        this.select = select;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
    public String toString() {
        return "SELECT " + select + " FROM " + from +
                (where != null ? " WHERE " + where : "") +
                (orderBy != null ? " ORDER BY " + orderBy : "");
    }

}

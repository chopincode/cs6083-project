import React, { useEffect } from "react";
import "./App.scss";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Route, Link, Switch } from "react-router-dom";
import { connect } from "react-redux";
import { getCustomers } from "./action/getCustomer";
import { getCustomerById } from "./action/getCustomerByID";
import CustomerCard from "./components/CustomerCard";
import CustomerForm from "./components/CustomerForm";

const App = ({
  customerList,
  getCustomers,
  getCustomerById,
  customerFormData
}) => {
  useEffect(() => {
    getCustomers();
  }, [getCustomers]);

  const onClick = event => {
    getCustomerById(event.target.id);
  };

  return (
    <Router>
      <div className="container">
        <h3>Welcome To WDS Insurance</h3>
        <p>Click A Customer's Info Card to Edit its information</p>
        <Switch>
          <Route path="/" exact>
            {customerList.map(customer => {
              return (
                <div key={customer.id} className="customer-card text-left">
                  <CustomerCard customer={customer} />
                  <Link
                    to="/customerform"
                    className="btn btn-primary btn-md"
                    id={customer.id}
                    onClick={onClick}
                  >
                    Edit Info
                  </Link>
                </div>
              );
            })}
          </Route>
          <Route path="/customerform" exact>
            <CustomerForm customerFormData={customerFormData} />
          </Route>
        </Switch>
      </div>
    </Router>
  );
};

const mapStateToProps = state => ({
  customerList: state.customerList,
  customerFormData: state.customerInfo
});

export default connect(mapStateToProps, { getCustomers, getCustomerById })(App);

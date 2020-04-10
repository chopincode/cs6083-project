import React, { Fragment, useEffect } from "react";
import "./App.css";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Navbar from "./components/layout/Navbar";
import Landing from "./components/layout/Landing";
import Register from "./components/auth/Register";
import Login from "./components/auth/Login";
import Alert from "./components/layout/Alert";

import store from "./store";
import { loadUser } from "./redux/actions/auth";
import setAuthToken from "./utils/setAuthToken";
import { Provider } from "react-redux";
import DashBoard from "./components/dashboard/DashBoard";
import PrivateRoute from "./components/routing/PrivateRoute";
import CreateProfile from "./components/profile/CreateProfile";
import EditProfile from "./components/profile/EditProfile";
import EmployeeLogin from "./components/auth/EmployeeLogin";
import EmployeeDashBoard from "./components/dashboard/EmployeeDashBoard";
import CustomerPortal from "./components/employee/CustomerPortal";
import Policy from "./components/employee/Policy";
import AutoPolicyDashboard from "./components/employee/AutoPolicyDashboard";
import HomePolicyDashBoard from "./components/employee/HomePolicyDashBoard";

if (localStorage.token) {
  setAuthToken(localStorage.token);
}

const App = () => {
  useEffect(() => {
    store.dispatch(loadUser());
  }, []);
  return (
    <Provider store={store}>
      <Router>
        <Fragment>
          <Navbar />
          <Route exact path="/" component={Landing} />
          <section className="container">
            <Alert />
            <Switch>
              <Route exact path="/register" component={Register} />
              <Route exact path="/login" component={Login} />
              <Route exact path="/employee-login" component={EmployeeLogin} />
              <Route
                exact
                path="/employee-dashboard"
                component={EmployeeDashBoard}
              />
              <Route exact path="/client-portal" component={CustomerPortal} />
              <Route exact path="/policy" component={Policy} />
              <Route exact path="/autopolicy" component={AutoPolicyDashboard} />
              <Route exact path="/homepolicy" component={HomePolicyDashBoard} />

              <PrivateRoute exact path="/dashboard" component={DashBoard} />
              <PrivateRoute
                exact
                path="/create-profile"
                component={CreateProfile}
              />
              <PrivateRoute
                exact
                path="/edit-profile"
                component={EditProfile}
              />
            </Switch>
          </section>
        </Fragment>
      </Router>
    </Provider>
  );
};

export default App;

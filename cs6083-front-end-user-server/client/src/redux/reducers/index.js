import { combineReducers } from "redux";
import alert from "./alert";
import auth from "./auth";
import profile from "./profile";
import employee from "./employee";
import customer from "./customer";
import auto from "./auto";
import driver from "./driver";
import autoInvoice from "./autoInvoice";
import home from "./home";
import homeInvoice from "./homeInvoice";

export default combineReducers({
  alert,
  auth,
  profile,
  employee,
  customer,
  auto,
  driver,
  autoInvoice,
  home,
  homeInvoice,
});

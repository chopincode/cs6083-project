import { combineReducers } from "redux";
import customerList from "./customerReducer";
import customerInfo from "./customerInfoReducer";
import customerForm from "./customerFormReducer";

export default combineReducers({
  customerList,
  customerInfo,
  customerForm
});

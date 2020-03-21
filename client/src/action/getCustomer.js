import axios from "axios";
import { GET_CUSTOMER } from "../types";

export const getCustomers = () => async dispatch => {
  const response = await axios.get("http://localhost:8080/api/customer");
  dispatch({
    type: GET_CUSTOMER,
    payload: response.data
  });
};

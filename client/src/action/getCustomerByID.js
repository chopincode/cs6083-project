import axios from "axios";
import { GET_CUSTOMER_BY_ID } from "../types";

export const getCustomerById = id => async dispatch => {
  const response = await axios.get(`http://localhost:8080/api/customer/${id}`);
  dispatch({
    type: GET_CUSTOMER_BY_ID,
    payload: response.data
  });
};

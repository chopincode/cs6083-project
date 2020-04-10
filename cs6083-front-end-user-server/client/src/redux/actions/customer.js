import { GET_CUSTOMER_INFO, CLEAR_CUSTOMER_INFO } from "../types";
import axios from "axios";

export const getCustomerInfo = (id) => async (dispatch) => {
  const res = await axios.get("http://localhost:8080/api/customer/" + id);

  try {
    dispatch({
      type: GET_CUSTOMER_INFO,
      payload: res.data,
    });
  } catch (error) {
    console.error(error);
  }
};

export const clearCustomerInfo = () => (dispatch) => {
  dispatch({
    type: CLEAR_CUSTOMER_INFO,
  });
};

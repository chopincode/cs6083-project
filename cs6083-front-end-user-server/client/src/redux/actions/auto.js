import { GET_AUTOS } from "../types";
import axios from "axios";

export const getAutoByPolicyNumber = (policyNumber) => async (dispatch) => {
  const res = await axios.get(`http://localhost:8080/api/auto/${policyNumber}`);

  dispatch({
    type: GET_AUTOS,
    payload: res.data,
  });
};

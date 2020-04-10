import { GET_HOMES } from "../types";
import axios from "axios";

export const getHomesByPolicyNumber = (policyNumber) => async (dispatch) => {
  const res = await axios.get(`http://localhost:8080/api/home/${policyNumber}`);

  dispatch({
    type: GET_HOMES,
    payload: res.data,
  });
};

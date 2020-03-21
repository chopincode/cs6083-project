import { GET_CUSTOMER } from "../types";
const initialState = [];

export default function(state = initialState, action) {
  const { type, payload } = action;

  switch (type) {
    case GET_CUSTOMER:
      return [...state, ...payload];

    default:
      return state;
  }
}

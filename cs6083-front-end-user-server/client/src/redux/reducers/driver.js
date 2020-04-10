import { GET_DRIVERS } from "../types";

const initialState = [];

export default function (state = initialState, action) {
  const { type, payload } = action;

  switch (type) {
    case GET_DRIVERS:
      return [...payload];

    default:
      return state;
  }
}

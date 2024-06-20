import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-lista-publicaciones-comercial-item')
export class VistaListaPublicacionesComercialItem extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout id="layoutItem" style="width: 100%;">
 <vaadin-vertical-layout id="layoutPublicacion" style="flex-grow: 0; overflow: hidden; flex-shrink: 0; width: 500px;  background-color: black; color: white;    border-radius: 10px;box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2);">
  <vaadin-vertical-layout theme="spacing" id="layaoutVideo" style="align-self: center; flex-grow: 0; flex-shrink: 0; display: flex; justify-content: center; align-items: center; overflow: hidden; height: 700px; background-color: black; width: 100%;"></vaadin-vertical-layout>
  <label id="numVisualizaciones" style="align-self: flex-start;">0</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

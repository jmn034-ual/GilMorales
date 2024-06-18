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
 <vaadin-vertical-layout id="layoutPublicacion" style="align-self: center; flex-grow: 1;">
  <vaadin-vertical-layout theme="spacing" id="layaoutVideo" style="align-self: stretch;"></vaadin-vertical-layout>
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

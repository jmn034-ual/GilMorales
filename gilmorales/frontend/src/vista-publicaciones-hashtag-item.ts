import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-publicaciones-hashtag-item')
export class VistaPublicacionesHashtagItem extends LitElement {
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
<vaadin-horizontal-layout class="content" id="layoutItem" style="background-color: #423F3F; width: 50%;">
 <vaadin-vertical-layout id="imagenPublicacion" style="justify-content: center; flex-shrink: 1; flex-grow: 0; margin: 0px; width: 80%; align-self: center; align-items: center;"></vaadin-vertical-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="justify-content: center; flex-shrink: 0; align-items: flex-start; width: 20%;">
  <vaadin-button theme="tertiary" id="botonNombreUsuario">
    NombreUsuario 
  </vaadin-button>
  <label id="descripcion" style="flex-grow: 0; width: 100%;">Label</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

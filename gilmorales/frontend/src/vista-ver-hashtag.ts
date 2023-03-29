import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver-hashtag')
export class VistaVerHashtag extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;" id="cabecera"></vaadin-vertical-layout>
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="layoutDatosHashtag" style="width: 100%; justify-content: center;">
  <vaadin-vertical-layout theme="spacing" id="imagenHashtag"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutInformacionHashtag">
   <h2 id="h2">#NombreHashtag</h2>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="flex-grow: 0; width: 100%;">
    <label id="numVisualizaciones">0</label>
    <label id="labelNumVisualizaciones" style="flex-grow: 1;">Numero Visualizaciones</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutLista" style="flex-grow: 1; width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="layoutHorizontal" style="width: 100%;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
